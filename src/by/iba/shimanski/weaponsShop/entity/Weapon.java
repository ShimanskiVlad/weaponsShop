package by.iba.shimanski.weaponsShop.entity;

import by.iba.shimanski.weaponsShop.interfaces.Producer;

public abstract class Weapon {

		private Double damage;
		
		private Double size;
		
		private Producer producer; 
		
		public Weapon() {
			this.damage = (double) 0;
			this.size = (double) 0;
		}
		
		public Weapon(Double damage, Double size, Producer producer) {
			this.damage = damage;
			this.size = size;
			this.producer = producer;
		}
		
		public Producer getProducer() {
			return producer;
		}

		public void setProducer(Producer producer) {
			this.producer = producer;
		}

		public Double getDamage() {
			return damage;
		}
		
		public void setDamage(Double damage) {
			this.damage = damage;
		}
		
		public Double getSize() {
			return size;
		}
		
		public void setSize(Double size) {
			this.size = size;
		}

		public Double bit() {
			return damage * size;
		}

		@Override
		public String toString() {
			return "Weapon [damage=" + damage + ", size=" + size + ", producer="
					+ producer + "]";
		}

		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((damage == null) ? 0 : damage.hashCode());
			result = prime * result
					+ ((producer == null) ? 0 : producer.hashCode());
			result = prime * result + ((size == null) ? 0 : size.hashCode());
			return result;
		}

		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Weapon other = (Weapon) obj;
			if (damage == null) {
				if (other.damage != null)
					return false;
			} else if (!damage.equals(other.damage))
				return false;
			if (producer != other.producer)
				return false;
			if (size == null) {
				if (other.size != null)
					return false;
			} else if (!size.equals(other.size))
				return false;
			return true;
		}

		
}
