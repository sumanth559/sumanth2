package CleanCode.task;

public class Construction{
	private double area;
	Construction(double area){
		this.area=area;
	}
	public double construction_cost(int choice)
	{
		double feets=area/10.764;
		switch(choice)
		{
		case 1 : return 1200*feets;
		case 2 :return 1500*feets;
		case 3 : return 1800*feets;
		case 4 :return 2100*feets;
		default : break;
		}
		return 0.0;
	}
}
