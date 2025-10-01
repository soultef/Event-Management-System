import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-organizer',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './register-component.html',
  styleUrls: ['./register-component.css']
})
export class RegisterComponent {
  organizer = {
    name: '',
    email: '',
    organization_name: '',
    phone: '',
    website: '',
    address: ''
  };

  submitOrganizer() {
    console.log("Organizer submitted:", this.organizer);
    // Later: Call API service here
  }
}

