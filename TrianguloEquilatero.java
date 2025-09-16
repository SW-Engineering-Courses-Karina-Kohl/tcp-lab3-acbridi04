public class TrianguloEquilatero extends FiguraGeometrica{
    private double lado;
    
    public TrianguloEquilatero(String cor, double lado){
        super(cor);
        this.lado = lado;
    }   
 
    @Override
    public double calcularArea(){
        return (Math.sqrt(3)/4)*Math.pow(lado,2); 
    }
    @Override
    public double calcularPerimetro(){
        return lado*3;
    }
    @Override
    public String getTipoFigura(){
        return "Triângulo Equilátero";
    }
    @Override
    public String getDetalhes(){
        return String.format("Lados %.2f",this.lado);
    }
    @Override
    public String getInfo(){
        return String.format("ID: %d, Cor: %s, Tipo: %s, Lados %.2f, Area: %.2f, Perimetro: %.2f", 
        super.getId(), super.getCor(), this.getTipoFigura(), this.lado, this.calcularArea(), this.calcularPerimetro());
    }
}
