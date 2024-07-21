class BulbService
{
Bulb bulb = new PhilipsBulb();
public String askForBulb()
{
	return bulb.getBulb();
}
}