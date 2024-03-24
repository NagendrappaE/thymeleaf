


document.addEventListener("DOMContentLoaded", function() {
	var publicurl = document.getElementById("publicurl").value;

	let formOne = document.forms.nameDetailsForm;

	let umrn = formOne.elements.umrn;
	umrn.value = 'NAMM';


	console.log(umrn);

	console.log(publicurl);


});


function callBank(url, formData) {
	fetch(pageContext + url, {
		method: 'POST',
		body: formData
	})
		.then(response => {
			if (!response.ok) {
				throw new Error('Network response was not ok');
			}
			return response.json();
		})
		.then(data => {
			populateBankDropdown(data);
		})
		.catch(error => {
			responseElement.innerHTML('There was a problem with the fetch operation:', error);

		});

}