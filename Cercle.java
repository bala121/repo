public class Cercle {
	private float x;
	private float y;
        
        public static void main(String[] args) {
       
        // Constructora per defecte
        Cercle c1=new Cercle();
        
        // Constructora per paràmetres
        Cercle c2 = new Cercle(2,6);
        
        // Constructora copiadora
        Cercle c3=new Cercle(c1);
        
        /*
            Mostrarem les característiques dels Poligons p1,p2 i p3 amb mostrarPoligon
        */
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        
    }
        
	
        
        public Cercle(){
        this.x=6;
        this.y=7;
        
        }
        
    //constructora per parametres
        public Cercle (float xx, float yy)
        {
            this.x=xx;
            this.y=yy;
        }
    
    
    //constructora copiadora
        public Cercle(Cercle c){
            this.x=c.x;
            this.y=c.y;
        }
    

    @Override
    public String toString() {
        return "Cercle{" + "x=" + x + ", y=" + y + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cercle other = (Cercle) obj;
        if (Float.floatToIntBits(this.x) != Float.floatToIntBits(other.x)) {
            return false;
        }
        if (Float.floatToIntBits(this.y) != Float.floatToIntBits(other.y)) {
            return false;
        }
        return true;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    



}