public class Body {
    int numberOfSockets;
    int numberOfLinks;

    Body() {
        shufleCountOfSockets(1, 6);
        shufleCountOfLinks(2, 6);
    }

    public int shufleCountOfSockets (int min, int max) {
        double forOne = 32.68;                   //1 socket 32.68% chance
        double forTwo = 29.41;                   //2 socket 29.41% chance
        double forThree = 26.14;                 //3 socket 26.14% chance
        double forFour = 9.80;                   //4 socket 9.80%  chance
        double forFive = 1.63;                   //5 socket 1.63%  chance
        double forSix = 0.33;                    //6 socket 0.33%  chance

        double rNumber = Math.random();
        double rValue = rNumber * (forOne + forTwo + forThree + forFour + forFive + forSix);

        if (rValue < forOne) {
            numberOfSockets = 1;
            return numberOfSockets;

        } else if (rValue < forOne + forTwo) {
            numberOfSockets = 2;
            return numberOfSockets;

        } else if (rValue < forOne + forTwo + forThree) {
            numberOfSockets = 3;
            return numberOfSockets;

        } else if (rValue < forOne + forTwo + forThree + forFour) {
            numberOfSockets = 4;
            return numberOfSockets;

        } else if (rValue < forOne + forTwo + forThree + forFour + forFive) {
            numberOfSockets = 5;
            return numberOfSockets;

        } else if (rValue < forOne + forTwo + forThree + forFour + forFive + forSix){
            numberOfSockets = 6;
            return numberOfSockets;
        }

        return 0;
    }

    public int shufleCountOfLinks (int min, int max) {
        double forTwo = 100;                    //2 socket 100%   chance
        double forThree = 33.33;                //3 socket 33.33% chance
        double forFour = 20;                    //4 socket 20%    chance
        double forFive = 0.66;                  //5 socket 0.66%  chance
        double forSix = 0.06;                   //6 socket 0.06%  chance

        double rNumber = Math.random();
        double rValue = rNumber * (forTwo + forThree + forFour + forFive + forSix);

        if (rValue < forTwo) {
            numberOfLinks = 2;
            return numberOfLinks;

        } else if (rValue < forTwo + forThree) {
            numberOfLinks = 3;
            return numberOfLinks;

        } else if (rValue < forTwo + forThree + forFour) {
            numberOfLinks = 4;
            return numberOfLinks;

        } else if (rValue < forTwo + forThree + forFour + forFive) {
            numberOfLinks = 5;
            return numberOfLinks;

        } else if (rValue < forTwo + forThree + forFour + forFive + forSix){
            numberOfLinks = 6;
            return numberOfLinks;
        }

        return 0;
    }
}
