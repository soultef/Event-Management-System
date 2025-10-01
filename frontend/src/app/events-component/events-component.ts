import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-event',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './events-component.html',
  styleUrls: ['./events-component.css']
})
export class EventsComponent {
  event = {
    title: '',
    description: '',
    category: '',
    date: '',
    time: '',
    location: '',
    capacity: 0,
    organizer_id: 0
  };

  submitEvent() {
    console.log("Event submitted:", this.event);
    // Later: Call API service here
  }
}
