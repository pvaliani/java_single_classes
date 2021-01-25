public class Planet {

//    initialise properties
    private String name;
    private long size;



//    constructor method
    public Planet (String name, long size){
        this.name = name;
        this.size = size;

    }

    public String getName(){

        return this.name;

    }

    public long getSize(){

        return this.size;

    }

    public String explode(){

        return "Planet " + this.name + " has went boom";
//        String out = String.format("Planet % has went boom", this.name + "went boom");
//        System.out.println(out);

    }


}
