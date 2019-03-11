package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSORS ;

    static {
            ROCK.beats = SCISSORS ;
            PAPER.beats = ROCK ;
            SCISSORS.beats = PAPER ;
        }

        private RockPaperScissorHandSign beats ;

        public boolean beats(RockPaperScissorHandSign other) {
            return beats == other;
        }

    public RockPaperScissorHandSign getWinner() {
//        this = RockPaperScissorHandSign.valueOf("PAPER");
//        if(RockPaperScissorHandSign == RockPaperScissorHandSign.ROCK)) {
//            return PAPER;
//        } else if(PAPER.equals(PAPER)) {
//            return SCISSORS;
//        } else {
//            return ROCK;
//        }
        return beats;
    }

    public RockPaperScissorHandSign getLoser() {

//        if(ROCK) {
//            return SCISSORS;
//        } else if(PAPER.equals(PAPER)) {
//            return ROCK;
//        } else {
//            return PAPER;
//        }
        return beats;
    }
}
