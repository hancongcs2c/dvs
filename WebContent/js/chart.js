// JavaScript Document
$(function(){
	
	var data= $('#data_source').html();
	data = $.parseJSON(data);  
 
    function createChart() {
        $("#chart").kendoChart({
            theme: $(document).data("kendoSkin") || "default",
            title: {
                text: "top changesets by employer"
            },
            legend: {
                position: "bottom"
            },
            seriesDefaults: {
                labels: {
                    visible: true,
                    format: "{0}%"
                }
            },
            dataSource: {
                data: data
            },
            series: [{
                type: "pie",
                field: "percent",
                categoryField: "affliation"
            }],
            tooltip: {
                visible: true,
                template: "${ category } - ${ value }%"
            }
        });
    }

    $(document).ready(function() {
        setTimeout(function() {
            createChart();
        }, 400);

        $(document).bind("kendo:skinChange", function(e) {
            createChart();
        });
    });
});

