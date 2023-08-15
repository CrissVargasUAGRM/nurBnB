package com.nur.valueObjects;


import com.nur.core.BusinessRuleValidationException;
import com.nur.core.ValueObject;
import com.nur.rules.ValidPointsRule;

public class ValorationValueObject extends ValueObject {
    public int points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public ValorationValueObject(int points) throws BusinessRuleValidationException {
        checkRule(new ValidPointsRule(points));
        this.points = points;
    }

    public static int implicitOperator(ValorationValueObject point){
        return point.getPoints();
    }

    public static ValorationValueObject implicitOperator(int point) throws BusinessRuleValidationException {
        return new ValorationValueObject(point);
    }
}
