################################################################################
#
# MyNotes README - Instructions For Building & Running
#
################################################################################


1.  Download

	I assume if you're reading this that you've found / downloaded the MyNotes
	project from Github at...

		https://github.com/tminke/MyNotes.git



2.  Build

	MyNotes is a gradle project, so you'll need to download gradle...

		http://services.gradle.org/distributions/gradle-1.11-bin.zip

	...and unzip into a directory that's on your PATH.

	Then simply change the MyNotes root directory (where this README is
	located) and run the default gradle build...

		> gradle

	...which will pull dependencies from Maven Central and build/test the
	project.



3.  IDE Integration

	If you wish to view the MyNotes project in Eclipse you can issue the
	following command to have gradle generate the necessary .project and
	.classpath files...

		> gradle eclipse

	...You can then just Import the project as an Existing Project.

	To do the same for IntelliJ you can do the following...

		> gradle idea

	...though I've not tested this and can't guarantee it will work :)



4.  Running

	To run the MyNotes project issue the following gradle command...

		> gradle jettyRunWar

	...which will build a war file and run it in Jetty on port 8080.
	If you have a port conflict with 8080 you can modify the build.gradle
	file to specify another port.

	Then simply point your browser at...

		http://localhost:8080/MyNotes/<UserName>

	...where <UserName> is any single word string representing a username
	such as "Travis".



5.  Usage

	In the interest of time, a real persistent database has not been
	included in the MyNotes application.  Instead persistence has been
	simulated in-memory and will only last for the lifetime of a single
	execution.

	Usernames are case insensitive, so "Bob", "bob", "bOB", and "BOB"
	all refer to the same user and will present the same list of notes.

	All "new" usernames will have an empty notes list, but the username
	"Bob" has been prepopulated with a sample list.

