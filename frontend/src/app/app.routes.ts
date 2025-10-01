import { Routes } from '@angular/router';
import { HomeComponent } from './home-component/home-component';
import { EventsComponent } from './events-component/events-component';
import { LoginComponent } from './login-component/login-component';
import { RegisterComponent } from './register-component/register-component';

export const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'events', component: EventsComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent },

  // Redirect root to home
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  // Wildcard for 404
  { path: '**', redirectTo: '/home' }];
