(function() {
	/* Hello World Example using D3.js
	*/
	function addLine(){
		d3.select("svg").append("line").attr("x1",20).attr("y1",20).attr("x2",400).attr("y2",400).style("stroke","black").style("stroke-width","2px");
	}
	
	function addText(x,y,text){
		d3.select("svg").append("text").attr("x",x).attr("y",y).text(text);
	}

	function addCircle(cx,cy,r,fillColor) {
		d3.select("svg").append("circle").attr("cx",cx).attr("cy",cy).attr("r",r).style("fill",fillColor);
	}

	function addTextWithOpacity(x,y,text,id) {
		d3.select("svg").append("text").attr("x",x).attr("y",y).attr("id",id).text(text).style("opacity",0);
	}

	// addLine();
	
	// addCircle(20,20,20,"red");
	// addText(20,20,"Hello");
	// addCircle(400,400,100,"blue");
	// addText(400,400,"World");

	d3.select("svg")
	  .append("circle")
	  .attr("r", 20)
	  .attr("cx",20)
	  .attr("cy",20)
	  .style("fill","red");

	d3.select("svg")
	  .append("text")
	  .attr("id", "a")
	  .attr("x",20)
	  .attr("y",20)
	  .style("opacity", 0)
	  .text("HELLO WORLD");

	d3.select("svg")
	  .append("circle")
	  .attr("r", 100)
	  .attr("cx",400)
	  .attr("cy",400)
	  .style("fill","lightblue");

	d3.select("svg")
	  .append("text")
	  .attr("id", "b")
	  .attr("x",400)
	  .attr("y",400)
	  .style("opacity", 0)
	  .text("Uh, hi.");

	  //d3.select("#a").transition().delay(1000).style("opacity",1);
	  d3.select("#a").transition().delay(1000).style("opacity", 1);
	  d3.select("#b").transition().delay(3000).style("opacity", .75);

	  d3.selectAll("circle").transition().delay(1000).attr("cy",200);

})();