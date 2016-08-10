package net.davidtanzer.reactspringboot.web;

import net.davidtanzer.jdefensive.Returns;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainPageController {
	@Value("${net.davidtanzer.webfrontend.bundledjs}")
	private boolean bundleJavaScript;

	@RequestMapping("/")
	public ModelAndView index() {
		Map<String, Object> model = new HashMap<>();

		model.put("bundleJavaScript", bundleJavaScript);

		return Returns.notNull(new ModelAndView("index", model));
	}
}
