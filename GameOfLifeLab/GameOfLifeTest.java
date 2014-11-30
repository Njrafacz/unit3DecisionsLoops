
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

public class GameOfLifeTest
{
    /**
    * Default constructor for test class GameOfLifeTest
    */
    public GameOfLifeTest()
    {
    }
    
    /**
    * Sets up the test fixture.
    *
    * Called before every test case method
    */
    @Before
    public void setUp()
    {
    }
    
    /**
    * Tears down the test fixture.
    *
    * Called after every test case method.
    */
    @After
    public void tearDown()
    {
    }
    
    
    /**
    * Tests the position of the cells in the grid.
    *
    * 
    */
    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
        * (X: alive; -: dead)
        * 
        * 0 1 2 3 4 5 6 7 8 9 10
        * 1 - X X - - - - - - -
        * 2 X X - - - - - - - - 
        * 3 - X - - - X - - - -
        * 4 - X - - X X X - - -
        * 5 - - - - X X X - - -
        * 6 - - - - - X - - X X
        * 7 - X X - - - X - X X
        * 8 X X - X X X X - X X
        * 9 - X - - - - - X X -
        *10 - - - - - - - - X -
        *
        */
        GameOfLife game = new GameOfLife();
        game.populateGame1();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();
        for(int row = 0; row < ROWS; row++)
    {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);
                
                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(
                (row == 1 && col == 2) ||
                (row == 1 && col == 3) ||
                (row == 2 && col == 1) ||
                (row == 2 && col == 2) ||
                (row == 3 && col == 2) ||
                (row == 4 && col == 5) ||
                (row == 4 && col == 6) ||
                (row == 4 && col == 7) ||
                (row == 5 && col == 5) ||
                (row ==5 && col == 6) ||
                ( row ==5 && col ==7) ||
                (row == 6 && col == 9) ||
                ( row == 6 && col == 6) ||
                (row == 6 && col == 10) ||
                (row == 7 && col == 2) ||
                (row == 7 && col == 3) ||
                (row == 7&& col == 7) ||
                (row == 7 && col == 9) ||
                (row == 7 && col == 10) ||
                (row == 8 && col == 1)  ||
                (row == 8 && col == 2)  ||
                (row == 8 && col == 4) ||
                (row == 8 && col == 5)  ||
                (row ==8 && col == 6)   ||
                (row == 8 && col == 6)  ||
                (row == 8 && col == 7) ||
                (row == 8 && col ==9) ||
                (row == 8 && col == 9) ||
                (row == 8 && col == 10) ||
                (row == 9 && col == 2) ||
                (row == 9 && col == 8) ||
                (row == 9 && col == 9) ||
                (row == 10 && col == 9))
                
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
        }
    }

}
    /**
    *Tests the final position of the cells in the grid.
    *
    * 
    */
    @Test 
    public void testFinalState()
    {
         GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();
        for (int counter=0; counter <=75; counter++)
            {
                game.createNextGeneration();
                
                
            }
        for(int row = 0; row < ROWS; row++)
    {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);
                
                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(
                ( row == 0 && col == 3) ||
                ( row == 0 && col == 4) ||
                ( row == 0 && col == 9) ||
                ( row == 0 && col == 10) ||
                ( row == 1 && col == 2) ||
                ( row == 1 && col == 5) ||
                ( row == 1 && col == 9) ||
                ( row == 1 && col == 10) ||
                ( row == 2 && col == 3) ||
                ( row == 2 && col == 4) ||
                ( row == 7 && col == 13) ||
                ( row == 7 && col == 14) ||
                (row == 8&& col == 13) ||
                ( row == 8 && col == 14))
               
                
                
                
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
        }
    }
    }
}

