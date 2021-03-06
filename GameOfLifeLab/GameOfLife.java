import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
* Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
* Also demonstrates how to provide accessor methods to make the class testable by unit tests.
* 
* @author @gcschmit
* @version 18 July 2014
*/
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game 
    private ActorWorld world;
    
    // the game board will have 50 rows and 50 columns
    private final int ROWS = 50;
    private final int COLS = 50;
    
    // constants for the location of the three cells initially alive
    private final int X1 = 0, Y1 = 0;
    private final int X2 = 1, Y2 = 1;
    private final int X3 = 2, Y3 = 2;

    /**
    * Default constructor for objects of class GameOfLife
    * 
    * @post the game will be initialized and populated with the initial state of cells
    * 
    */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        populateGame1();
        
        // display the newly constructed and populated world
        world.show();
    
    }
    
    
    /**
    * Creates the actors and inserts them into their initial starting positions in the grid
    *
    * @pre the grid has been created
    * @post all actors that comprise the initial state of the game have been added to the grid
    * 
    */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        // (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(1, 2);
        grid.put(loc1, rock1);
        //
        Rock rock2 = new Rock();
        Location loc2 = new Location(1, 3);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(2, 1);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(2, 2);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(3, 2);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(7,2);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(7,3);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(8, 1);
        grid.put(loc8, rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(8,2);
        grid.put(loc9, rock9);
        
        Rock rock10 = new Rock();
        Location loc10 = new Location(9, 2);
        grid.put(loc10, rock10);
        
        Rock rock11 = new Rock();
        Location loc11 = new Location(5, 5);
        grid.put(loc11, rock11);
        
        Rock rock12 = new Rock();
        Location loc12 = new Location(5, 6);
        grid.put(loc12, rock12);
        
        Rock rock13 = new Rock();
        Location loc13 = new Location(4, 6);
        grid.put(loc13, rock13);
        
        Rock rock14 = new Rock();
        Location loc14 = new Location(4, 7);
        grid.put(loc14, rock14);
        
        Rock rock15 = new Rock();
        Location loc15 = new Location(6, 6);
        grid.put(loc15, rock15);
        
        Rock rock16 = new Rock();
        Location loc16 = new Location(9, 8);
        grid.put(loc16, rock16);
        
        Rock rock17 = new Rock();
        Location loc17 = new Location(9, 9);
        grid.put(loc17, rock17);
        
        Rock rock18 = new Rock();
        Location loc18 = new Location(10, 9);
        grid.put(loc18, rock18);
        
        Rock rock19 = new Rock();
        Location loc19 = new Location(8, 9);
        grid.put(loc19, rock19);
        
        Rock rock20 = new Rock();
        Location loc20 = new Location(8, 10);
        grid.put(loc20, rock20);
        
    
    }
    
    /**
    * Creates the actors and inserts them into their initial starting positions in the grid
    *
    * @pre the grid has been created
    * @post all actors that comprise the initial state of the game have been added to the grid
    * 
    */
    public void populateGame1()
    {
        // the grid of Actors that maintains the state of the game
        // (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(1, 2);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(2, 2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(3, 2);
        grid.put(loc3, rock3);

        Rock rock4 = new Rock();
        Location loc4 = new Location(4, 5);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(4,6);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(4, 7);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(5, 7);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(6, 9);
        grid.put(loc8, rock8);
     


        Rock rock9 = new Rock();
        Location loc9 = new Location(6, 10);
        grid.put(loc9, rock9);
        

        Rock rock10 = new Rock();
        Location loc10 = new Location(7, 7);
        grid.put(loc10, rock10);
        
        Rock rock11 = new Rock();
        Location loc11 = new Location(7, 9);
        grid.put(loc11, rock11);
        
        Rock rock12 = new Rock();
        Location loc12 = new Location(7, 10);
        grid.put(loc12, rock12);
        
        Rock rock13 = new Rock();
        Location loc13 = new Location(8, 4);
        grid.put(loc13, rock13);
        
        Rock rock14 = new Rock();
        Location loc14 = new Location(8, 5);
        grid.put(loc14, rock14);
        
        Rock rock15 = new Rock();
        Location loc15 = new Location(8, 6);
        grid.put(loc15, rock15);
        
        Rock rock16 = new Rock();
        Location loc16 = new Location(8, 7);
        grid.put(loc16, rock16);
        
        
        
    
    }
    /**
    * Generates the next generation based on the rules of the Game of Life and updates the grid
    * associated with the world
    *
    * @pre the game has been initialized
    * @post the world has been populated with a new grid containing the next generation
    * 
    */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
        * in order to implement the Game of Life algorithm and leverage the GridWorld framework.
        */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // insert magic here...
        for (int row= 0; row<=ROWS; row++)
        {
            for( int col=0; col <=COLS; col++)
            {
                Location loc = new Location(row,col);
                ArrayList<Location> objectList = grid.getOccupiedAdjacentLocations(loc);
                ArrayList<Location> occupiedLocations = grid.getOccupiedLocations();
                if( objectList.size() < 2 && occupiedLocations.contains(loc) ||
                objectList.size() > 3 && occupiedLocations.contains(loc))
                {
                    grid.remove(loc);
                }
                else if( objectList.size() == 2 && occupiedLocations.contains(loc) ||
                objectList.size() == 3 && occupiedLocations.contains(loc) ||
                objectList.size() ==3 && !occupiedLocations.contains(loc))
            {
                Rock rock = new Rock();
                newGrid.put(loc, rock);
            
            
            }
            }
        
        }
        grid = newGrid;
        world.setGrid(grid);
        world.show();
    }
    /**
    * Returns the actor at the specified row and column. Intended to be used for unit testing.
    *
    * @param row the row (zero-based index) of the actor to return
    * @param col the column (zero-based index) of the actor to return
    * @pre the grid has been created
    * @return the actor at the specified row and column
    */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }
    
    /**
    * Returns the number of rows in the game board
    *
    * @return the number of rows in the game board
    */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
    * Returns the number of columns in the game board
    *
    * @return the number of columns in the game board
    */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
    * Creates an instance of this class. Provides convenient execution.
    *
    */
        public static void main(String[] args)
        throws InterruptedException
        
        {
            GameOfLife game = new GameOfLife();
            for (int counter=0; counter <=75; counter++)
            {
                game.createNextGeneration();
                Thread.sleep(100);
                
            }
    }

}
