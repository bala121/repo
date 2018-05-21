public class Cercle {
	private float x;
	private float y;
        
	
        
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