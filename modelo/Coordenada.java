package modelo;

public class Coordenada 
{
    private double x;
    private double y;
    private double distancia;

    public Coordenada()
    {   
    }
    
    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() 
    {
        return x;
    }

    public void setX(double x) 
    {
        this.x = x;
    }

    public double getY() 
    {
        return y;
    }

    public void setY(double y) 
    {
        this.y = y;
    }
    
    public String toString()
    {
        return "(X:"  + x + " , Y:"+ y + ")";
    }
    
    public boolean equals(Object o)
    {
        Coordenada otra = (Coordenada)o;
        return (x==otra.x) && (y==otra.y);
    }

    public double getDistancia() 
    {
        return distancia;
    }

    public void CalcularDistancia(Object o) 
    {
        Coordenada otra = (Coordenada)o;
        distancia = Math.sqrt((x-otra.x) * (x-otra.x) + (y-otra.y)*(y-otra.y));
    }  
}