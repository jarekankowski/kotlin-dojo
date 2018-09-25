package dojo

import java.io.*

class ConsoleUI(
    private var game: Game = Game(),
    private val input: () -> String? = ::readLine,
    private val output: (String) -> Unit = ::println
) {

    fun run() {
        output(render())

        while (!game.isGameOver) {
            try {
                val input = input() ?: break
                val move = parseInput(input)
                game = game.makeMove(move, game.nextCellToPlace())
                output(render())
            } catch (invalidMove: Game.InvalidMove) {
                output(invalidMove.message + "\n" + render())
            } catch (e: IOException) {
                output("Unrecoverable error")
            }

        }
    }

    fun render() = GameRenderer(game).render()

    private fun parseInput(input: String): Move {
        try {
            val split = input.split(" ")
            if (split.size < 2) {
                throw Game.InvalidMove(invalidInputMessage(input))
            }
            val row = split[0].toInt()
            val column = split[1].toInt()
            return Move(row, column)
        } catch (e: NumberFormatException) {
            throw Game.InvalidMove(invalidInputMessage(input))
        }

    }

    private fun invalidInputMessage(message: String) =
        "Invalid input '$message', please make sure it's zero-indexed 'x y' coordinates"
}