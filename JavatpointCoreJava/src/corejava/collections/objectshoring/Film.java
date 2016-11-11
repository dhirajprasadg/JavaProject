package corejava.collections.objectshoring;

 final class Film {
	 String name;
	 double rating ;
	

	public double getRating() {
		return rating;
	}

	public Film setRating(double rating) {
		this.rating = rating;
		return this;
	}

	public String getName() {
		return name;
	}

	public Film setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String toString() {
		return "Film [name=" + name + ", rating=" + rating + "]";
	}

	
	
}
