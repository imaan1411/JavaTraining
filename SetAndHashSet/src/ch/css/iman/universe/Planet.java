package ch.css.iman.universe;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, HeavenlyBodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getBodyType() == HeavenlyBodyType.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }


}
