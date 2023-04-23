$(document).ready(function() {
  // Load the XML file using Ajax
  $.ajax({
    url: 'cars.xml',
    dataType: 'xml',
    success: function(data) {
      // Parse the XML data and create the car gallery
      $(data).find('car').each(function() {
        var make = $(this).find('make').text();
        var model = $(this).find('model').text();
        var year = $(this).find('year').text();
        var color = $(this).find('color').text();
        var price = $(this).find('price').text();

        var carItem = $('<div class="car-item"></div>');
        carItem.html('<h3>' + make + ' ' + model + '</h3><p>' + year + ', ' + color + ', $' + price + '</p>');
        $('.car-gallery').append(carItem);

        // Add click event handler to each car item
        carItem.click(function() {
          var details = $('<div></div>');
          details.html('<h3>' + make + ' ' + model + '</h3><p>Year: ' + year + '</p><p>Color: ' + color + '</p><p>Price: $' + price + '</p>');
          $('.car-details').html(details).fadeIn();
        });
      });
    },
    error: function() {
      alert('Error loading XML file');
    }
  });
});
