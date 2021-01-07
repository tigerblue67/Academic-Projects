package part01;

public enum SupRegion {
	UNITED_KINGDOM {
		@Override
		String getRegionAsString() {
			// TODO Auto-generated method stub
			return "United Kingdom";
		}
	}, EUROPE {
		@Override
		String getRegionAsString() {
			// TODO Auto-generated method stub
			return "Europe";
		}
	}, OUTSIDE_EU {
		@Override
		String getRegionAsString() {
			// TODO Auto-generated method stub
			return "Outside Europe";
		}
	};
	
	abstract String getRegionAsString();
}
