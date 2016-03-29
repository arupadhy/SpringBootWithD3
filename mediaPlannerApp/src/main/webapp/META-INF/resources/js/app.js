(function() {

	var data = [1,2,3,5];
	d3.selectAll("svg.d3").data(data).enter().append("circle").attr("cx",10).attr("cy",30).attr("r",30);

})();