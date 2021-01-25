public class WaterBottle {
//    initialise object
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drink(){
        this.volume = this.volume - 10;
    }

    public void emptyBottle(){
        this.volume = 0;
    }


}
