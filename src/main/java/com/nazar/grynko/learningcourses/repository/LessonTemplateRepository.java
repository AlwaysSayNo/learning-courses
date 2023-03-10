package com.nazar.grynko.learningcourses.repository;

import com.nazar.grynko.learningcourses.model.LessonTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LessonTemplateRepository extends JpaRepository<LessonTemplate, Long> {

    List<LessonTemplate> getLessonTemplatesByChapterTemplateId(Long chapterTemplateId);

    Optional<LessonTemplate> getLessonTemplateByIdAndChapterTemplateIdAndChapterTemplateCourseTemplateId(Long id, Long chapterTemplateId, Long courseTemplateId);

}