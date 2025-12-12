class Truck {
    MusicPlayer player; // aggregation

    Truck(MusicPlayer player) {
        this.player = player;
    }

    void start() {
        System.out.println("Truck started");
        player.play();
    }
}

class MusicPlayer {
    void play() {
        System.out.println("Playing music...");
    }
}

