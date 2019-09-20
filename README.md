# cljs-demo

A Leiningen template for a CLJS demo.

## Usage

This demo app includes a CLJ webserver and two simple CLJS apps:  
- CLJS simple app  
- Reframe SPA  

## Before Clojurepalooza
- clone this repo   `git clone git@github.com:ALai57/cljs-demo-template.git`  
- cd to the newly cloned repo `cd cljs-demo-template`  
- run the command `lein new cljs-demo myproject`  
- glance through the new directory `cljs-demo-template/myproject`  
- If you have a project.clj that's got some missing stuff, you're good to go!


## Still to do  
- Run through example building multiple times  

## License

Copyright © 2019 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.



# Learning objectives:

Configure CLJS project build  
1)	What is CLJS?  
2)	Configure build :cljsbuild  
3)	Build with lein cljsbuild once dev  
4)	Tour the output files and directory  

Setup example.html to run the JS  
1)	Edit the example.html file  
2)	Move example.js to same folder as example.html  

Setup Figwheel to serve app  
5)	Configure handler piece  
6)	Configure Piggieback  
7)	Get the app up and running  

Tour the JS file, talk about react  
1)	Hiccup syntax – this is just JS  
2)	Change it and watch it in real time!  
3)	Add on click behavior that sorts the data and re-renders the table  
4)	Add a circle  
5)	Add on click behavior that moves the circle  
