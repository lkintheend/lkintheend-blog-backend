/*
 * Created on 2018-10-01 ( Date ISO 2018-10-01 - Time 16:29:46 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.controller;

import com.ifi.entity.Tag;
import com.ifi.service.TagServiceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/tag", produces = "application/hal+json")
public class TagController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TagController.class);

	private static final String NOT_FOUND ="Tag not found";

	@Autowired
	private TagServiceImpl tagService;

	@RequestMapping(value = "/",
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Tag> findAll() {
		List<Tag> list = tagService.findAll();
		return list;
	}


	@GetMapping("{id}")
	public Tag get(@PathVariable("id") Integer id) {
		final Tag tag = tagService.getOne(id);
		LOGGER.info("Tag found : {}", tag);
		return tag;
	}

	@PostMapping(consumes = "application/json")
	public Tag create(@RequestBody Tag tag) {
		LOGGER.info("Tag creation request : {}", tag);
		if (tagService.exist(tag)) {
			LOGGER.info("Tag already exist ! : {}", tag);
			return null;
		} else {
			final Tag created = tagService.create(tag);
			LOGGER.info("Created tag {}", created);
			return created;
		}
	}

	@PutMapping(value = "{id}", consumes = "application/json")
	public Tag update(@PathVariable("id") Integer id, @RequestBody Tag tag) {
		return tagService.update(tag);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		LOGGER.info("Tag deletion request : {}", resolveIdForLogger(id));
		if (tagService.delete(id)) {
			LOGGER.info("Tag succesfully deleted");
		} else {
			LOGGER.info(NOT_FOUND);
		}
	}

	private String resolveIdForLogger(Integer id) {
		final StringBuilder ids = new StringBuilder();
		ids.append(String.valueOf(id));
		return ids.toString();
	}

}

