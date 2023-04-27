package com.app.Fruits;

public abstract class Fruit {
        private String color,name;
        private double weight;
        private boolean fresh;
      
		public Fruit(String color, String name, double weight, boolean fresh) {
			super();
			this.color = color;
			this.name = name;
			this.weight = weight;
			this.fresh = fresh;
		}
		public Fruit getdetail() {
			return this;
		}
		public String taste() {
			return "No Specific Taste";
		}
		@Override
		public String toString() {
			return "Fruit [color=" + color + ", name=" + name + ", weight=" + weight + "]";
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public boolean isFresh() {
			return fresh;
		}
		public void setFresh(boolean fresh) {
			this.fresh = fresh;
		}
//		public void isfresh(boolean fresh) {
//			this.fresh=fresh;
//		}
       
		
}
