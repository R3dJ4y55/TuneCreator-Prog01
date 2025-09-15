
/**
 * Write a description of class TuneCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TuneCreator
{
    // instance variables - replace the example below with your own
    private MidiPlayer player;

    /**
     * Constructor for objects of class TuneCreator
     */
    public TuneCreator()
    {
        player = new MidiPlayer();
    }

    // Create a tune and plays it
    public void CreateAndplay()
    {
        // Create localy stored sickBeat
        SimpleTune sickBeat = new SimpleTune();
        
        // Add notes to sickBeat
        sickBeat.addNote("E", 20);
        sickBeat.addNote("E", 20);
        sickBeat.addNote("E", 20);
        sickBeat.addNote("E", 15);
        sickBeat.addNote("E", 15);
        sickBeat.addNote("E", 10);
        sickBeat.addNote("E", 10);
        sickBeat.addNote("E", 9);
        sickBeat.addNote("E", 8);
        sickBeat.addNote("E", 7);
        sickBeat.addNote("E", 6);
        sickBeat.addNote("E", 5);
        sickBeat.addNote("E", 3);
        sickBeat.addNote("E", 1);
        sickBeat.addNote("E", 1);
        sickBeat.addNote("E", 1);
        sickBeat.addNote("E", 1);
        sickBeat.addNote("E", 1);
        sickBeat.addNote("E", 1);
        sickBeat.addNote("Bb", 12);
        sickBeat.addNote("C", 1);
        sickBeat.addNote("B", 1);
        sickBeat.addNote("A", 1);
        
        //Play the sickBeat && Set instrument
        sickBeat.setInstrument(9);
        player.playTune(sickBeat);
    }
}
