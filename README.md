# Jetbrains Academy - Unit Converter

My solutions for the Jetbrains Academy Problem Unit Converter

https://hyperskill.org/projects/70

The solution is build up step by step over several stages. 
Stage 1 is the first and simple one. The following stages 
build up on the previous stages and get more and more advanced.
There are five stages in total.

Because each stage is completely independent of the previous one,
IntelliJ might show some warnings about duplicated code between 
the stages.

## Stage 1/5

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/70/stages/385/implement)

Just some basic output.

just execute this:

    gradle -PmainClass=stage1.MainKt run --console=plain
    
    145 centimeters is 1.45 meters
    2 miles is 3.2187 kilometers
    5.5 inches is 139.7 millimeters
    12 degrees Celsius is 53.6 degrees Fahrenheit
    3 pounds is 1.360776 kilograms

## Stage 2/5

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/70/stages/386/implement)

We can convert kilometer into meter.

just execute this:

    gradle -PmainClass=stage2.MainKt run --console=plain
    
    Enter a number of kilometers:
    123
    123 kilometers is 123000 meters

## Stage 3/5

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/70/stages/387/implement)

We can convert some length dimensions.

just execute this:

    gradle -PmainClass=stage3.MainKt run --console=plain
    
    Enter a number and a measure of length:
    1234 mm
    1234.0 millimeters is 1.234 meters

## Stage 4/5

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/70/stages/388/implement)

Now we can convert lengths and weights.

just execute this:

    gradle -PmainClass=stage4.MainKt run --console=plain
    
    Enter what you want to convert (or exit): 2 m in yards
    2.0 meters is 2.1872265966754156 yards
    
    Enter what you want to convert (or exit): 75 kg in pounds
    75.0 kilograms is 165.34683151378331 pounds
    
    Enter what you want to convert (or exit): exit

## Stage 5/5

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/70/stages/389/implement)

Here we add the ability to convert temperatures.

just execute this:

    gradle -PmainClass=stage5.MainKt run --console=plain
    
    Enter what you want to convert (or exit): 1 C in K
    1.0 degree Celsius is 274.15 kelvins

    Enter what you want to convert (or exit): 33 C in F
    33.0 degrees Celsius is 91.4 degrees Fahrenheit

    Enter what you want to convert (or exit): exit
