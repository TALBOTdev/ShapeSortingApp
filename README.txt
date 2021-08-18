DRIVER README

MADE BY:
--------------------------
Ben Talbot (000791397)
Feb 27, 2020
---------------------------


---------------------------
*******CONTENTS********
---------------------------
-INSTALLATION
-INSTRUCTIONS
-DEVELOPER NOTES

---------------------------
*****INSTALLATION******
---------------------------
Extract Sort.jar file if currently zipped.
Open a Command Prompt window and type:

java -jar */filepath/*

The easiest way to do this is to drag the file into the program.
The filepath will automatically be pasted.

---------------------------
*****INSTRUCTIONS*****
---------------------------

TAKE NOTE that all program specifications begin with the "-" character.
These steps are numbered for convenience, but can be executed in any order.

1.) *SPECIFY FILEPATH OF SORTABLE FILE*
The filepath of the file to be sorted must be specified. All file specifications begin with the letter "f",
followed by the filepath of the file

EX: -fpolyfor1.txt

2.) *SPECIFY MEASUREMENT TO SORT BY*
The unit to be sorted must also be specified. All unit specifications begin with the letter "t",
followed by the unit type. The unit options are "h" for height, "a" for area, and "v" for volume
NOTE that neither character is case sensitive

EX: -tv

3.) *SPECIFY SORT TYPE*
The type of sort must also be specified. All sort specifications begin with the letter "s",
followed by the desired sort type. The sort options are "b" for Bubble Sort, "s" for Selection Sort,
"i" for Insertion Sort, "m" for Merge Sort, "q" for Quick Sort, and "z" for Gnome Sort.
NOTE that neither character is case sensitive

EX: -sb

This will send the selection to the opponent client and if they other player is ready, the game's results 
will be displayed on both clients.


A complete query may look something like: -fsortFile.txt -tA -Sm


If the file is found and is compatable, the program will run and return every thousandth entry, including the 
first and last, as well as the total run time the algorithm took.



---------------------------
***DEVELOPER NOTES***
---------------------------
The input must be compatable or the program WILL crash spectacularily.
