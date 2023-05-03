class Pitbull extends Dog{

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void describe() {
        System.out.println("Pitbull : anjing petarung dan memiliki rahang kuat dan mengunci"); 
    }
    @Override
    public void move() {
        this.position += 3;
        System.out.println("Pitbull bergeser ke : " + position);
        
    }
}