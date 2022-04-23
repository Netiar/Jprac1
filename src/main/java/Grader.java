public class Grader {
    public char determineLetterGrade (int numberGrade) throws illegalArgumentException {
        if (numberGrade < 0 ){
            Object number_grade_cannot_be_negative;
            throw new illegalArgumentException("");
        }
        else if (numberGrade < 40){
            return 'F';
        }
        else if (numberGrade < 50) {
            return 'E';
        }
        else if (numberGrade < 60) {
            return 'D';
        }
        else if (numberGrade < 70) {
            return 'C';
        }
        else if (numberGrade < 80) {
            return 'B';
        }
        else  {
            return 'A';
        }
    }


    static class illegalArgumentException extends Throwable {
        public illegalArgumentException(String number_grade_cannot_be_negative) {
        }
    }
}
