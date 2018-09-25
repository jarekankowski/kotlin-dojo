# Tic Tac Toe 

## The rules of the game

The object of Tic Tac Toe is to get three in a row. 

You play on a three by three game board.
- One player places X and the other places O on the board. 
- Players alternate placing Xs and Os on the game board until either player has three in a row
 or all nine squares are filled.

## Task
The challenge of this task is to convert the java classes to Kotlin.

### Recommended conversion path:
1. Cell
2. Move
3. Board
4. BoardRenderer
5. Game
6. GameRenderer
7. FunctionThatThrows
8. ConsoleUI
9. Main
10. Test
11. Remove FunctionThatThrows
12. Add missing functionality, make all the tests pass

### Useful links
- [Kotlin documentation](https://kotlinlang.org/docs/reference/)
- [Kotlin cheatsheet](https://fabiomsr.github.io/from-java-to-kotlin/index.html)

### Notes
The shortcut on IntelliJ to convert the codebase is:
- on Mac: Cmd + Alt + Shift + K
- on Win: Ctrl + Alt + Shift + K

## Gameplay sample
A simple execution of the game will look like that (coordinates are 0 indexed starting from the top left corner):

     | | 
    -+-+-
     | | 
    -+-+-
     | | 
    
    Player X please make a move: 0 0
    
    X| | 
    -+-+-
     | | 
    -+-+-
     | | 
    
    Player O please make a move: 1 0
    
    X| | 
    -+-+-
    O| | 
    -+-+-
     | | 
    
    Player X please make a move: 0 1
    
    X|X| 
    -+-+-
    O| | 
    -+-+-
     | | 
     
    Player O please make a move: 1 1
    
    X|X| 
    -+-+-
    O|O| 
    -+-+-
     | | 
    
    Player X please make a move: 0 2
    
    X|X|X
    -+-+-
    O|O| 
    -+-+-
     | | 
    
    X is the winner!