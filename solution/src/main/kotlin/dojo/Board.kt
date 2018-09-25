package dojo

import dojo.Cell.*
import java.util.*

class Board(private val grid: List<List<Cell>>) {

    constructor(board: Board) : this(board.grid)

    operator fun set(row: Row, column: Column, value: Cell): Board {
        val gridCopy = grid.map { ArrayList(it) }
        gridCopy[row][column] = value
        return Board(gridCopy)
    }

    operator fun get(row: Row, column: Column) = grid[row][column]

    val size = grid.size

    fun isFull() =
        grid.all { subList -> subList.all { it != Empty } }

    fun all(coordinates: List<Pair<Row, Column>>, cell: Cell) =
        coordinates.all { (first, second) -> get(first, second) == cell }
}