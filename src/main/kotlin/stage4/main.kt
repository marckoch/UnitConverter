package stage4

enum class UnitType {LENGTH, WEIGHT, UNKNOWN}

enum class Unit(val type: UnitType, val normalizedName: String, val factor: Double) {
    METER(UnitType.LENGTH, "meter", 1.0),
    KILOMETER(UnitType.LENGTH, "kilometer", 1_000.0),
    CENTIMETER(UnitType.LENGTH, "centimeter", 0.01),
    MILLIMETER(UnitType.LENGTH, "millimeter", 0.001),
    MILE(UnitType.LENGTH, "mile", 1_609.35),
    YARD(UnitType.LENGTH, "yard", 0.9144),
    FOOT(UnitType.LENGTH, "foot", 0.3048),
    INCH(UnitType.LENGTH, "inch", 0.0254),
    GRAM(UnitType.WEIGHT, "gram", 1.0),
    KILOGRAM(UnitType.WEIGHT, "kilogram", 1_000.0),
    MILLIGRAM(UnitType.WEIGHT, "milligram", 0.001),
    POUND(UnitType.WEIGHT, "pound", 453.592),
    OUNCE(UnitType.WEIGHT, "ounce", 28.3495),
    UNKNOWN(UnitType.UNKNOWN, "???", 0.0);
}

fun main() {
    while (true) {
        print("Enter what you want to convert (or exit): ")

        val input = readLine()!!
        if (input == "exit") {
            break
        }

        val (x, fromUnit, _, toUnit) = input.split(" ")
        val fromValue = x.toDouble()

        val from = getNormalizedUnit(fromUnit)
        val to = getNormalizedUnit(toUnit)

        // error 1: "from" and/or "to" is unknown
        if (from == Unit.UNKNOWN || to == Unit.UNKNOWN) {
            val displayFrom = plural(from.normalizedName)
            val displayTo = plural(to.normalizedName)
            println("Conversion from $displayFrom to $displayTo is impossible")
            continue
        }

        // error 2: both are known/correct but incompatible (length <> weight)
        if (from.type != to.type) {
            println("Conversion from ${plural(from.normalizedName)} to ${plural(to.normalizedName)} is impossible")
            continue
        }

        val result = fromValue * from.factor / to.factor

        val displayFromUnit = if (fromValue == 1.0) from.normalizedName else plural(from.normalizedName)
        val displayResultUnit = if (result == 1.0) to.normalizedName else plural(to.normalizedName)

        println("$fromValue $displayFromUnit is $result $displayResultUnit")
    }
}

fun getNormalizedUnit(unit :String): Unit {
    return when (unit.toLowerCase()) {
        "m", "meter", "meters" -> Unit.METER
        "km", "kilometer", "kilometers" -> Unit.KILOMETER
        "cm", "centimeter", "centimeters" -> Unit.CENTIMETER
        "mm", "millimeter", "millimeters" -> Unit.MILLIMETER
        "mi", "mile", "miles" -> Unit.MILE
        "yd", "yard", "yards" -> Unit.YARD
        "ft", "foot", "feet" -> Unit.FOOT
        "in", "inch", "inches" -> Unit.INCH
        "g", "gram", "grams" -> Unit.GRAM
        "kg", "kilogram", "kilograms" -> Unit.KILOGRAM
        "mg", "milligram", "milligrams" -> Unit.MILLIGRAM
        "lb", "pound", "pounds" -> Unit.POUND
        "oz", "ounce", "ounces" -> Unit.OUNCE
        else -> Unit.UNKNOWN
    }
}

fun plural(unit: String) = when (unit) {
    "foot" -> "feet"
    "inch" -> "inches"
    "???" -> "???"
    else -> unit + "s"
}