/* Set the width of the sidebar to 250px and the left margin of the page content to 250px */
function expandSideBar() {
    document.getElementById("side-bar").style.width = "270px";
    document.getElementById("side-bar-collapse-handler").style.left = "270px";
    document.getElementById("main").style.left = "270px";
    document.getElementById("main").style.width = "calc(100% - 270px)";
    document.getElementById("side-bar-collapse-handler-collapse").style.visibility = "visible";
    document.getElementById("side-bar-collapse-handler-expand").style.visibility = "hidden";
    document.getElementById("side-bar-items").style.fontSize = "17px";
}

/* Set the width of the sidebar to 0 and the left margin of the page content to 0 */
function collapseSideBar() {
    document.getElementById("side-bar").style.width = "0";
    document.getElementById("side-bar-collapse-handler").style.left = "0";
    document.getElementById("main").style.left = "0";
    document.getElementById("main").style.width = "100%";
    document.getElementById("side-bar-collapse-handler-collapse").style.visibility = "hidden";
    document.getElementById("side-bar-collapse-handler-expand").style.visibility = "visible";
    document.getElementById("side-bar-items").style.fontSize = "0";
}