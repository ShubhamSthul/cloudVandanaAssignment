function submitForm() {
    const firstName = document.getElementById('first-name').value;
    const lastName = document.getElementById('last-name').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const gender = Array.from(document.querySelectorAll('input[type="checkbox"]:checked')).map(cb => cb.value);
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    const popupData = document.getElementById('popup-data');
    popupData.innerHTML = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${gender.join(', ')}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    document.getElementById('popup').style.display = 'block';

    return false; // Prevent the form from submitting
}

function resetForm() {
    document.getElementById('survey-form').reset();
}

function closePopup() {
    document.getElementById('popup').style.display = 'none';
    resetForm();
}

window.onclick = function(event) {
    if (event.target == document.getElementById('popup')) {
        closePopup();
    }
}
