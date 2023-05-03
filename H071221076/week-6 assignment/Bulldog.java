class Bulldog extends Dog{
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void describe() {
        System.out.println("Bulldog : anjing yang sulit beranak dan tidak bisa berada pada cuaca panas dan kelembaban yang ekstrem");
    }
    
    @Override
    public void move() {
        this.position += 1;
        System.out.println("Bulldog bergeser ke : " + position);
    }
}