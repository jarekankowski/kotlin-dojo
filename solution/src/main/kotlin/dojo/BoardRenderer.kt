package dojo

import dojo.Cell.*

class BoardRenderer(private val board: Board) {

    fun render() =
        (0 until board.size)
            .joinToString("-+-+-\n") { this.renderRow(it) }

    private fun renderRow(row: Row) =
        (0 until board.size)
            .joinToString("") { column -> renderCell(row, column) + squareSeparator(column) } + "\n"

    private fun renderCell(row: Row, column: Column) =
        when (board[row, column]) {
            X -> "X"
            O -> "O"
            Empty -> " "
        }

    private fun squareSeparator(column: Column) = if (column < board.size - 1) "|" else ""
}
