# ace-java-assist
A library that creates autocomplete and compile assistance in ACE for java libs

# WIP
This is a work in progress.  It's intended to support MVCodeClub's web based bukkit plugin maker.  

It exports a JSON file based on the based on the bukkit javadocs.

There's some other js (to be included soon) that hooks into ACE and provides autocomplete and package import suggestoins.

# How to use
You'll need the JDK in your path

* Run bukkit.bat to grab bukkit sources from github
* Run compile.bat to compile the java doclet code
* Run export.bat to run the doclet

It currently spits a hacked up JSON file to STDOUT.  You'll have to do some light editing to remove errors and format the JSON but it's pretty close to what you will need.

