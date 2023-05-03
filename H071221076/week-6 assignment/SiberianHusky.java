class SiberianHusky extends Dog{
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void describe() {
        System.out.println("Siberian Husky : anjing yang memiliki umur lebih panjang dari anjing lain dan naluri berburu yang kuat");
    }
    @Override
    public void move() {
        this.position += 2;
        System.out.println("Siberian Husky bergeser ke : " + position);
        
    }
}