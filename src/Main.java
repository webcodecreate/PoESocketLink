public class Main {

    public static void main(String[] args) {
        Body body;
        int socketCount = 0;
        int linkCount = 0;

        do {
            body = new Body();
            socketCount++;
            System.out.println(body.numberOfSockets + " - " + socketCount);
        } while (body.numberOfSockets < 6);

        do {
            body = new Body();
            linkCount++;
            System.out.println(body.numberOfLinks + " - " + linkCount);
        } while (body.numberOfLinks < 6);

        System.out.println("6 sockets for - " + socketCount);
        System.out.println("6 link for - " + linkCount);
    }
}
