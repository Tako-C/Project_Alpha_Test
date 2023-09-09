document.addEventListener('DOMContentLoaded', () => {
  const registerButton = document.getElementById('registerButton');
  registerButton.addEventListener('click', async () => {
    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    
    app.get('/register.html', (req, res) => {
      res.sendFile(__dirname + '/register.html');
    });
    
    try {
      const response = await fetch('/register', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({ username, email, password }),
      });

      const data = await response.json();

      if (response.ok) {
        console.log('Record added successfully:', data.message);
      } else {
        console.error('Error adding record:', data.error);
      }
    } catch (error) {
      console.error('An error occurred:', error);
    }
  });
});
