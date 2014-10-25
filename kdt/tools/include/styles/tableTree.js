var nodeState = new Array();
var hoverNode = new Array();
var selectedRow="r1";
var highlightedRow="r1";

function toggleRows(elem) {
 var rows = document.getElementsByTagName("TR");
 var rowId = elem.parentNode.parentNode.parentNode.id;
 var state = nodeState[rowId];
 if (state == null || state == "open")
 {
  removeImg(elem);
  addImg(elem, "include/pictures/directory_closed.gif");
  
  for (var i = 0; i < rows.length; i++) {
   var r = rows[i];
   if (matchHide(r.id, rowId)) {
    hide(r);
	hoverNode[r.id]=rowId;
   }
  }
  nodeState[rowId]="close";
 }
 else if (state=="close")
 {
  removeImg(elem);
  addImg(elem, "include/pictures/directory_open.gif");
  
  for (var i = 0; i < rows.length; i++) {
   var r = rows[i];
   if (matchShow(r.id, rowId)) show(r);
  }
  nodeState[rowId]="open";
 }
}

function matchHide(targetId, parentId) {
 
 var idx = targetId.indexOf(parentId);
 //alert(targetId+" "+parentId+" "+idx);
 return idx == 0 && targetId != parentId && hoverNode[targetId] == null;
}

function matchShow(targetId, parentId) {
 var idx = targetId.indexOf(parentId);
 return idx == 0 && hoverNode[targetId] == parentId;
}

function hide(row) {
 row.style.display="none";
}

function show(row) {
 if (document.all) row.style.display = "block"; //IE4+ specific code
 else row.style.display = "table-row"; //Netscape and Mozilla
 hoverNode[row.id]=null;
}

function removeImg(aNode) {
 while (aNode.firstChild) aNode.removeChild(aNode.firstChild);
}

function addImg(aNode, imgPath) {
 var imgNode = document.createElement("img");
 aNode.appendChild(imgNode);
 imgNode.className="nodeDirectory";
 imgNode.src=imgPath;
}

function selectRow(row) {
 document.getElementById(selectedRow).className="rowUsual";
 row.className = "rowSelect";
 selectedRow=row.id;
}

function highlightRow(row) {
 document.getElementById(highlightedRow).className=(highlightedRow==selectedRow?"rowSelect":"rowUsual");
 row.className = "rowHighlight";
 highlightedRow=row.id;
}