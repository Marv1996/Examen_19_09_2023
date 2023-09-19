package service;

import model.Plane;

public class PlaneService {

    public void Task1(Plane plane) {
        System.out.println("Model: " + plane.getModel());
        System.out.println("Country: " + plane.getCountry());
        System.out.println("Year: " + plane.getYear());
        System.out.println("Military: " + plane.isMilitary());
        System.out.println("Weight: " + plane.getWeight());
        System.out.println("Wingspan: " + plane.getWingspan());
        System.out.println("TopSpeed: " + plane.getTopSpeed());
        System.out.println("Seats: " + plane.getSeats());
        System.out.println("Cost: " + plane.getCost());
    }

    public void Task2(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println(
                    "Cost: " + plane.getCost() + "TopSpeed: " + plane.getTopSpeed()
            );
        } else {
            System.out.println(
                    "Model: " + plane.getModel() + "Country: " + plane.getCountry()
            );
        }
    }

    public Plane Task3(Plane planeFirst, Plane planeSecond) {
        if (planeFirst.getYear() < planeSecond.getYear()) {
            return planeFirst;
        } else if (planeFirst.getYear() > planeSecond.getYear()) {
            return planeSecond;
        }
        return planeFirst;
    }

    public String Task4(Plane planeFirst, Plane planeSecond) {
        if (planeFirst.getWingspan() > planeSecond.getWingspan()) {
            return planeFirst.getModel();
        }
        return planeSecond.getModel();
    }

    public void Task5(Plane planeFirst, Plane planeSecond, Plane planeThird) {
        if (planeFirst.getSeats() > planeSecond.getSeats() &&
                planeFirst.getSeats() > planeThird.getSeats()) {
            System.out.println(planeFirst.getCountry());
        } else if (planeSecond.getSeats() > planeFirst.getSeats() &&
                planeSecond.getSeats() > planeThird.getSeats()) {
            System.out.println(planeSecond.getCountry());
        } else if (planeThird.getSeats() > planeFirst.getSeats() &&
                planeThird.getSeats() > planeSecond.getSeats()) {
            System.out.println(planeThird.getCountry());
        } else if (planeFirst == planeSecond && planeSecond == planeThird) {
            System.out.println(planeFirst.getCountry());
        }
    }

    public void Task6(Plane[] planes) {
        PlaneService planeService = new PlaneService();
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                planeService.Task1(plane);
            }
        }
    }

    public void Task7(Plane[] planes) {
        Plane planeMilitary = null;
        PlaneService planeService = new PlaneService();

        for (Plane plane : planes) {
            if (planeMilitary == null) {
                if (plane.isMilitary()) {
                    planeMilitary = plane;
                } else if (plane.isMilitary() && plane.getHours() > 100) {
                    planeMilitary = plane;
                }
            }
        }
        if (planeMilitary != null) {
            planeService.Task1(planeMilitary);
        } else {
            System.out.println("Don't have military plane");
        }
    }

    public Plane Task8(Plane[] planes) {
        Plane minWeightPlaneFirst = planes[0];
        Plane minWeightPlaneSecond = planes[1];
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getWeight() < minWeightPlaneFirst.getWeight()) {
                minWeightPlaneFirst = planes[i];
            }
        }
        return minWeightPlaneFirst; ///////??????????????
    }

    public Plane Task9(Plane[] planes) {
        Plane minMilitaryCoastPlain = null;
        for (Plane plane : planes) {
            if (minMilitaryCoastPlain == null) {
                if (plane.isMilitary()) {
                    minMilitaryCoastPlain = plane;
                } else if (plane.isMilitary() && plane.getCost() < minMilitaryCoastPlain.getCost()) {
                    minMilitaryCoastPlain = plane;
                }
            }
        }
        return minMilitaryCoastPlain;
    }

    public void Task10(Plane[] planes) {
        PlaneService planeService = new PlaneService();
        Plane tempPlain;
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < planes.length - i; j++) {
                if (planes[j].getYear() > planes[j - 1].getYear()) {
                    tempPlain = planes[j];
                    planes[j] = planes[j - 1];
                    planes[j - 1] = tempPlain;
                }
            }
        }
        for (Plane plane : planes) {
            planeService.Task1(plane);
        }
    }
}
