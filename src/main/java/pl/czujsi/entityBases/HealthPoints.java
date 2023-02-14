package pl.czujsi.entityBases;

import lombok.AllArgsConstructor;

import lombok.ToString;

@ToString
@AllArgsConstructor
public class HealthPoints {

    private double maxHealthPoints;
    private double minHealthPoints;
    private double healthPointsRegeneration;
    private double currentHealthPoints;

    public HealthPoints(double maxHealthPoints, double minHealthPoints, double healthPointsRegeneration) {
        this.maxHealthPoints = maxHealthPoints;
        this.minHealthPoints = minHealthPoints;
        this.healthPointsRegeneration = healthPointsRegeneration;
        this.currentHealthPoints = this.maxHealthPoints;
    }


    public double getOverallHealthPoints() {
        return this.currentHealthPoints;
    }


    public String writeHealthPointsRegeneration() {
        return "Health points regeneration is at: " + this.healthPointsRegeneration + "%";
    }

    public String writeOverallHealthPoints() {
        return "Health points: " + this.currentHealthPoints;
    }
}
