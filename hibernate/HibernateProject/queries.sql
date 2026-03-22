select 
	alien.id as alien_id, 
	alien.name, 
	alien.tech,
	laptop.id as laptop_id,
	laptop.ram,
	laptop.brand,
	laptop.model
from 
	alien 
left join 
	alien_laptop 
	on alien.id = aliens_id
left join 
	laptop
	on laptop.id = laptops_id;